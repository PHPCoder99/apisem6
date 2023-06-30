package com.company;

public class Laptop {
    private String manufacturer;
    private Integer version;
    private String color;
    private String os;
    private Integer ram;
    private Integer rom;

    public Laptop(){

    }

    public Laptop(String manufacturer, Integer version, String color, String os, Integer ram, Integer rom) {
        this.manufacturer = manufacturer;
        this.version = version;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.rom = rom;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacturer='" + manufacturer + '\'' +
                ", version=" + version +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                '}';
    }
}
