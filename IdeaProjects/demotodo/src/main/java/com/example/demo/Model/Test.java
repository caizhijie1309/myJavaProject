package com.example.demo.Model;

/**
 * Created by Cookie on 2018/2/5.
 */
public class Test {
    //id,disease_name,disease_type,disease_description

    public Test(Integer id, String diseaseName, Integer diseaseType, String diseaseDescription) {
        this.id = id;
        this.diseaseName = diseaseName;
        this.diseaseType = diseaseType;
        this.diseaseDescription = diseaseDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public Integer getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(Integer diseaseType) {
        this.diseaseType = diseaseType;
    }

    public String getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

    private Integer id;
    private String diseaseName;
    private Integer diseaseType;
    private String diseaseDescription;

}
