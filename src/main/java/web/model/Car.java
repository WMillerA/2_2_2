package web.model;

public class Car {
    private String models;
    private String series;
    private String engine;

    public Car(String models, String series, String engine) {
        this.models = models;
        this.series = series;
        this.engine = engine;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String model) {
        this.models = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
