package org.openjfx.models;

import org.openjfx.DownloadManager;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FileInfo {

    private SimpleIntegerProperty index;
    private SimpleStringProperty name;
    private SimpleStringProperty url;
    private SimpleStringProperty status; // 'DOWNLOADING', 'DONE', 'STARTING'
    private DownloadManager downloadmanager;
    
    public FileInfo()


}
