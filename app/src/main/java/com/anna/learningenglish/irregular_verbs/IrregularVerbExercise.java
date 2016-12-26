package com.anna.learningenglish.irregular_verbs;

import com.anna.learningenglish.Database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class IrregularVerbExercise implements Iterator<IrregularVerb> {
    private final Random random = new Random();
    private int id;

    private int amount;
    private ArrayList<AnswerRecord> answerRecords;

    public IrregularVerbExercise(int counter) {
        this.amount = counter;
        answerRecords = new ArrayList<>();
    }

    public ArrayList<AnswerRecord> getAnswerRecords() {
        return answerRecords;
    }

    public int getAmount() {
        return amount;
    }

    public int getAnsweredAmount() {
        return answerRecords.size();
    }

    public int getCorrectAmount() {
        int amount = 0;
        for (AnswerRecord record : answerRecords)
            if (record.getStatus() == Status.SUCCESS)
                amount++;
        return amount;
    }

    private boolean checkByVerbId(int verbId) {
        for (AnswerRecord record : answerRecords)
            if (verbId == record.getVerbId())
                return false;
        return true;
    }

    public IrregularVerb answer(IrregularVerb user_answer) {
        Status status = Status.FAILED;
        IrregularVerb answer = Database.findIrregularVerb(id);
        if (user_answer.equals(answer))
            status = Status.SUCCESS;

        answerRecords.add(new AnswerRecord(id, user_answer, status));

        return answer;
    }

    public int getCurrent() {
        return this.answerRecords.size();
    }

    @Override
    public boolean hasNext() {
        return this.amount > this.answerRecords.size();
    }

    public IrregularVerb next() {

        do {
            id = random.nextInt(Database.getLength());
        } while (!this.checkByVerbId(id));

        IrregularVerb verb = Database.findIrregularVerb(id);
        IrregularVerb task = verb.clone();

        //todo: сделать для второй и третей формы
        task.setSecondForm("");
        task.setThirdForm("");

        return task;
    }

}