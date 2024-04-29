package com.example.myapplication;

import java.util.ArrayList;

public class EventDetails {
        public int id;
        private String name;
        private String desc;
        private int date;

        //constructors
        public EventDetails(int id, String name, String desc, int date)
        {
            this.id = id;
            this.name = name;
            this.desc = desc;
            this.date = date;
        }

        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }

        //setters and getters
        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getDescription()
        {
            return desc;
        }

        public void setDescription(String description)
        {
            this.desc = description;
        }

        public int getDate()
        {
            return date;
        }

        public void setDate(int date)
        {
            this.date = date;
        }
        public static ArrayList<EventDetails> getEvents(){
            ArrayList<EventDetails> Events = new ArrayList<>();
            Events.add(new EventDetails(1,  "Appointment", "Doctor's Appointment", 5-12-24 ));
            return Events;
        }
    }

