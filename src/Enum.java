public enum Enum {
    ThreeNumbersInLine("НЕЛЬЗЯ 3 ЦИФРЫ ПОДРЯД"),LetterZ("НЕЛЯЗЯ Z ЭТО ИМПЕРИАЛИЗМ"),ByZero("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
    private String error;

    Enum(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
