package org.example;


    public class Workout extends Todo {
        private int sets;
        private int reps;
        private String bodyPart;

        public Workout(String name, int sets, int reps, String bodyPart) {
            super(name);
            this.sets = sets;
            this.reps = reps;
            this.bodyPart = bodyPart;
        }

        public int getSets() {
            return sets;
        }

        public int getReps() {
            return reps;
        }

        public String getBodyPart() {
            return bodyPart;
        }
    }

