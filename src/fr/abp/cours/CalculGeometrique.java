package fr.abp.cours;

public interface CalculGeometrique {
    default public double surface() {
        return -1;
    }

    default public double perimetre() {
        return -1;
    }
}

