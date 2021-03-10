package reader;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import service.Shop;
import service.StockRoom;

import java.io.File;
import java.io.IOException;

public class ReaderFile {
    private static final String FILE_SHOP = "HomeworkJavaFinal/resources/Shop.json";
    private static final String FILE_STOCK_ROOM = "HomeworkJavaFinal/resources/Stock_Room.json";
    private final ObjectMapper mapper = new ObjectMapper();

    public Shop readerShop() {
        Shop shop = new Shop();
        File f = new File(FILE_SHOP);
        try {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            shop = mapper.readValue(f, Shop.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shop;
    }

    public StockRoom readerStockRoom() {
        StockRoom stockRoom = new StockRoom();
        File f = new File(FILE_STOCK_ROOM);
        try {
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            stockRoom = mapper.readValue(f, StockRoom.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stockRoom;
    }
}
