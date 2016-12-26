package com.anna.learningenglish.irregular_verbs;

enum Status {
    SUCCESS,
    FAILED
}

public class AnswerRecord {
    private int verbId;
    private IrregularVerb answer;
    private Status status;

    AnswerRecord(int verbId){
        this.verbId = verbId;
    }

    AnswerRecord(int verbId, IrregularVerb answer, Status status){
        this.verbId = verbId;
        this.answer = answer;
        this.status = status;
    }

    public void setVerbId(int verbId) {
        this.verbId = verbId;
    }

    public void setAnswer(IrregularVerb answer) {
        this.answer = answer;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getVerbId() {
        return this.verbId;
    }

    public IrregularVerb getAnswer() {
        return this.answer;
    }

    public Status getStatus() {
        return status;
    }


}