interface TextFormatter {
    String format(String text);
}

class UppercaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}

class LowercaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}

class TextEditor {
    private TextFormatter formatter;

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public String formatText(String text) {
        if (formatter == null) {
            throw new IllegalStateException("Formatter not set.");
        }
        return formatter.format(text);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setFormatter(new UppercaseFormatter());
        System.out.println(editor.formatText("Hello World")); // Outputs: HELLO WORLD

        editor.setFormatter(new LowercaseFormatter());
        System.out.println(editor.formatText("Hello World")); // Outputs: hello world
    }
}