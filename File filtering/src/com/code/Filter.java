package com.code;

import java.io.File;
import java.io.FilenameFilter;

public class Filter implements FilenameFilter {

    String extent;

    Filter(String extent) {

        this.extent = extent;
    }

    public boolean accept(File dir, String name) {

        return name.endsWith("." + extent);
    }
}
