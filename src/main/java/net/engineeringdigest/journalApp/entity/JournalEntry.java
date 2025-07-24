package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")//this tells spring that this class is mapped in MONGODB
@Data
public class JournalEntry {
    @Id //Unique key
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;


}
