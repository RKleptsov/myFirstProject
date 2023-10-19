public enum Enum {
    ThreeNumbersInLine("НЕЛЬЗЯ 3 ЦИФРЫ ПОДРЯД"),LetterZ("НЕЛЬЗЯ Z ЭТО ИМПЕРИАЛИЗМ"),ByZero("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ"),NeTotSimvol("СИМВОЛ НЕ ПОДОШЕЛ");
    private String error;
    Enum(String error) {
        this.error = error;
    }
    public String getError() {
        return error;
    }
}