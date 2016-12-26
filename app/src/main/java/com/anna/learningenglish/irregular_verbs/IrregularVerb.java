package com.anna.learningenglish.irregular_verbs;

public class IrregularVerb implements Cloneable {
    private String firstForm = "";
    private String secondForm = "";
    private String thirdForm = "";
    private String example = "";

    public IrregularVerb(String firstForm, String secondForm, String thirdForm, String example) {
        this.firstForm = firstForm;
        this.secondForm = secondForm;
        this.thirdForm = thirdForm;
        this.example = example;
    }

    public IrregularVerb(String firstForm, String secondForm, String thirdForm) {
        this.firstForm = firstForm;
        this.secondForm = secondForm;
        this.thirdForm = thirdForm;
    }

    @Override
    public IrregularVerb clone() {
        try {
            return (IrregularVerb) super.clone();
        } catch (CloneNotSupportedException exception) {
            return new IrregularVerb(
                    firstForm, secondForm, thirdForm,
                    example);
        }
    }

    public String getFirstForm() {
        return firstForm;
    }

    public void setFirstForm(String firstForm) {
        this.firstForm = firstForm;
    }

    public String getSecondForm() {
        return secondForm;
    }

    public void setSecondForm(String secondForm) {
        this.secondForm = secondForm;
    }

    public String getThirdForm() {
        return thirdForm;
    }

    public void setThirdForm(String thirdForm) {
        this.thirdForm = thirdForm;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IrregularVerb))
            return false;

        if (obj == this)
            return true;

        IrregularVerb irregularVerb = (IrregularVerb) obj;
        return this.getFirstForm().equals(irregularVerb.getFirstForm()) &
                this.getSecondForm().equals(irregularVerb.getSecondForm()) &
                this.getThirdForm().equals(irregularVerb.getThirdForm());
    }
}