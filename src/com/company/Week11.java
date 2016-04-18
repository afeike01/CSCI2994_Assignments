package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by AlexFeike on 4/18/2016.
 */
public class Week11
{

}
interface WeatherDataSource
{
    public void addListener(WeatherDataListener listener);
    public void removeListener(WeatherDataListener listener);
    public void update();
}
interface WeatherDataListener
{
    public void updateData(WeatherData newData);
}
abstract class WeatherData
{
    private String dataType;
    private Double measuredValue;

    WeatherData(String dataType, Double measuredValue)
    {
        this.dataType=dataType;
        this.measuredValue=measuredValue;
    }
    public String getDataType(){return dataType;}
    public Double getMeasuredValue(){return measuredValue;}
    abstract public String getUpdateMessage();
}
class TemperatureSensor implements WeatherDataSource
{
    private double currentTemperature;
    private List<WeatherDataListener> listeners = new ArrayList<WeatherDataListener>();

    TemperatureSensor()
    {
        updateTemperature();
    }
    public double getCurrentTemperature(){return currentTemperature;}
    private void updateTemperature()
    {
        //read from humidity sensor
        currentTemperature=new Random().nextDouble()*100;
    }
    @Override
    public void addListener(WeatherDataListener listener)
    {
        listeners.add(listener);
    }
    @Override
    public void removeListener(WeatherDataListener listener)
    {
        listeners.remove(listener);
    }
    @Override
    public void update()
    {
        System.out.println("TemperatureSensor:  getting new data.");
        updateTemperature();
        for(WeatherDataListener listener : listeners)
        {
            listener.updateData(new WeatherData("temperature",currentTemperature)
            {
                @Override
                public String getUpdateMessage()
                {
                    return "The new temperature is "+currentTemperature;
                }
            });
        }
    }
}
class HumiditySensor implements WeatherDataSource
{
    private double currentHumidity;
    private List<WeatherDataListener> listeners = new ArrayList<WeatherDataListener>();
    HumiditySensor()
    {
        updateHumidity();
    }
    public double getCurrentHumidity()
    {
        return currentHumidity;
    }
    private void updateHumidity()
    {
        //read from humidity sensor
        currentHumidity=new Random().nextDouble();
    }
    @Override
    public void addListener(WeatherDataListener listener)
    {
        listeners.add(listener);
    }
    @Override
    public void removeListener(WeatherDataListener listener)
    {
        listeners.remove(listener);
    }
    @Override
    public void update()
    {
        System.out.println("HumiditySensor:  getting new data.");
        updateHumidity();
        for(WeatherDataListener listener : listeners)
        {
            listener.updateData(new WeatherData("humidity",currentHumidity)
            {
                @Override
                public String getUpdateMessage()
                {
                    return "Humidity updated to "+currentHumidity;
                }
            });
        }
    }
}
class PressureSensor implements WeatherDataSource
{
    private double currentAtmosphericPressure;
    private List<WeatherDataListener> listeners = new ArrayList<WeatherDataListener>();
    PressureSensor()
    {
        updatePressure();
    }
    public double getCurrentAtmosphericPressure(){return currentAtmosphericPressure;}
    private void updatePressure()
    {
        currentAtmosphericPressure=new Random().nextDouble();
    }
    @Override
    public void addListener(WeatherDataListener listener)
    {
        listeners.add(listener);
    }
    @Override
    public void removeListener(WeatherDataListener listener)
    {
        listeners.remove(listener);
    }
    @Override
    public void update()
    {
        System.out.println("PressureSensor:  getting new data.");
        updatePressure();
        for(WeatherDataListener listener : listeners)
        {
            listener.updateData(new WeatherData("pressure",currentAtmosphericPressure)
            {
                @Override
                public String getUpdateMessage()
                {
                    return "Atmospheric Pressure updated to "+currentAtmosphericPressure;
                }
            });
        }
    }
}
class WeatherStation implements WeatherDataListener
{
    private Map<String,Double> allWeatherData = new HashMap<String, Double>();
    private List<String> log=new ArrayList<String>();

    @Override
    public void updateData(WeatherData newData)
    {
        System.out.println("WeatherStation:  Updating the weather station data with new "+newData.getDataType()+" data.");
        allWeatherData.put(newData.getDataType(),newData.getMeasuredValue());
        log.add(newData.getUpdateMessage());
    }
    public void displayCurrentWeather()
    {
        System.out.println("Weather Report");
        for(String dataType : allWeatherData.keySet())
        {
            System.out.println(dataType + ": "+allWeatherData.get(dataType));
        }
    }
    public void displayLog()
    {
        for(int i=0;i<log.size();i++)
        {
            int currentLine = i+1;
            System.out.println(currentLine+": "+log.get(i));
        }
    }
}
