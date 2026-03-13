package com.preetish.gpsspoof.service;

import com.preetish.gpsspoof.model.Location;
import org.springframework.stereotype.Service;

import java.io.FileWriter;

@Service
public class LocationService {

    public String processLocation(Location location) {

        double lat = location.getLatitude();
        double lon = location.getLongitude();

        System.out.println("Latitude: " + lat);
        System.out.println("Longitude: " + lon);

        try {

            String gpx =
                    "<?xml version=\"1.0\"?>\n" +
                            "<gpx version=\"1.1\" creator=\"Xcode\">\n" +
                            "<wpt lat=\"" + lat + "\" lon=\"" + lon + "\">\n" +
                            "<name>Dynamic Location</name>\n" +
                            "<time>2026-01-01T00:00:00Z</time>\n" +
                            "</wpt>\n" +
                            "</gpx>";

            FileWriter writer = new FileWriter(
                    "/Users/preetish/Desktop/LocationTest/LocationTest/Delhi.gpx"
            );
            writer.write(gpx);
            writer.close();

            return "GPX generated successfully";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error generating GPX file: " + e.getMessage();
        }
    }
}