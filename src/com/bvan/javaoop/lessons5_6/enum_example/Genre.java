package com.bvan.javaoop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public enum Genre {
    COMEDY("Funny movie") {
        @Override
        public String toString() {
            return "Comeeeedy";
        }
    },
    ACTION("....") {
        @Override
        public String toString() {
            return ".....";
        }
    },
    THRILLER("....");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String getShortName() {
        return name().substring(0, 3).toLowerCase();
    }

    public String getDescription() {
        return description;
    }


}
