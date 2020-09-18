
package com.builder;

public class Person {

    private String name, surname, address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public Person(Builder builder) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }


    public static class Builder{

        private String name, surname, address;

        public Builder(){ }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }


}
