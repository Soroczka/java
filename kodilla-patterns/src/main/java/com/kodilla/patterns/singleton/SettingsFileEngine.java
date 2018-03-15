package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    private SettingsFileEngine(){

    }

    public static SettingsFileEngine getInstance(){
        if(settingsFileEngineInstance == null){
            synchronized (SettingsFileEngine.class){
                if(settingsFileEngineInstance == null){
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFileName(){
        return fileName;
    }

    public void open(final String fileName){
        this.fileName = fileName;
        System.out.printf("opening the settings file");
    }

    public void close(){
        this.fileName = "";
        System.out.printf("closing the settings from file");
    }

    public boolean loadSettings(){
        System.out.printf("loading settings from file");
        return true;
    }

    public boolean saveSettings(){
        System.out.printf("Saving settings to file");
        return true;
    }

}
