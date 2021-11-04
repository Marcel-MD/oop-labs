package md.utm.marcel.lab6;

import java.util.List;

public class History {
    private List<String> history;

    public History(List<String> history) {
        this.history = history;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "History{" +
                "history=" + history +
                '}';
    }
}
