import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;


public class PzzBot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
    }

    public String getBotUsername() {
        return "CoursePzz_bot";
    }

    public String getBotToken() {
        return "1104774405:AAGZNZc-PYl3Va_QZLAD-c1kRUEjethHwTA";
    }
}
