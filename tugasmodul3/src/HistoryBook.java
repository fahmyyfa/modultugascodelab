class HistoryBook extends Book {
    private int duration;

    public HistoryBook(String bookId, String title, String author, String category, int stock, int duration) {
        super(bookId, title, author, category, stock);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
