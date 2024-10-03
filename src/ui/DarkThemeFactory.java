package ui;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();  // Creates dark theme button
    }

    @Override
    public TextField createTextField() {
        return new DarkThemeTextField();  // Creates dark theme text field
    }
}