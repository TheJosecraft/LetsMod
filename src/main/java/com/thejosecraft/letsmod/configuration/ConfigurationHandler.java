package com.thejosecraft.letsmod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init( File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            // Carga el archivo de configuracion
            configuration.load();

            // Lee en las propiedades del archivo de configuracion
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is anexample config value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Registra la exception
        }
        finally
        {
            //Guarda el archivo de configuracion
            configuration.save();
        }

        System.out.println(configValue);
    }
}
