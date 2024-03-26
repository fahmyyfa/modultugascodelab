class StoryBook extends Book {
    private int duration;

    public StoryBook(String bookId, String title, String author, String category, int stock, int duration) {
        super(bookId, title, author, category, stock);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}