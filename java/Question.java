class Question {
    private String question;
    private String[] answers;
    private int correctAnswerIndex;

    public Question(String question, String[] answers, int correctAnswerIndex) {
        this.question = question;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer(int index) {
        return answers[index];
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public boolean checkAnswer(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
}
