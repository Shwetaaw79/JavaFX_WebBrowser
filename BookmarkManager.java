package mybrowser;

import java.util.ArrayList;
import java.util.List;

public class BookmarkManager {
    private static List<String> bookmarks = new ArrayList<>();

    public static void saveBookmark(String url) {
        if (!bookmarks.contains(url)) {
            bookmarks.add(url);
            System.out.println("Bookmark Added: " + url);
        }
    }

    public static List<String> getBookmarks() {
        return bookmarks;
    }
}
