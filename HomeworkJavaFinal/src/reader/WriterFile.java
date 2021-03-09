package reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import service.Shop;
import service.StockRoom;

import java.io.*;

public class WriterFile {
    private static final String FILE_SHOP = "HomeworkJavaFinal/resources/Shop.json";
    private static final String FILE_STOCK_ROOM = "HomeworkJavaFinal/resources/Stock_Room.json";
    ObjectMapper mapper = new ObjectMapper();

    public void writerShop(Shop shop) {
        try {
            mapper.writeValue(new File(FILE_SHOP), shop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writerStockRoom(StockRoom stockRoom) {
        try {
            mapper.writeValue(new File(FILE_STOCK_ROOM), stockRoom);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

