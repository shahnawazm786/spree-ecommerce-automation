package org.utils.files;

import org.utils.repository.IConfiguration;

import java.io.File;

public class GetFiles {
public static final File getFile(EFilesType keys){
    File file=null;
    switch (keys){
        case XLSX -> {
            file=new File(IConfiguration.MAIN_BASE_FOLDER+"");
        }
        case JSON -> {
            file=new File(IConfiguration.MAIN_BASE_FOLDER+"");
        }
        case LOG -> {
            file=new File(IConfiguration.MAIN_BASE_FOLDER+"");
        }
        case IMAGE -> {
            file=new File(IConfiguration.MAIN_BASE_FOLDER+"");

        }
        case PROPERTIES -> {
            file=new File(IConfiguration.MAIN_BASE_FOLDER+"");
        }
        default -> {
            file=new File(IConfiguration.MAIN_BASE_FOLDER+"");
        }
    }
    return file;
    }
    private final static boolean isExist(File file){
        if(file.exists()){return true;}
        else{return false;}
    }
}
