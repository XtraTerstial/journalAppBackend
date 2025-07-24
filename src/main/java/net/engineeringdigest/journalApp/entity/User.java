package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {
    @Id
    private ObjectId id;

    @Indexed(unique = true)// tells that username should be unique
    @NonNull// tell's the below shouldn't be null
    private String username;

    @NonNull// tell's the below shouldn't be null
    private String password;

    @DBRef //conect JournalEntry with User
    private List<JournalEntry> journalEntries=new ArrayList<>();
}
