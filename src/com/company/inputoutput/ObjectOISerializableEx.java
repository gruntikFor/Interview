package com.company.inputoutput;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.List;

import static com.company.inputoutput.Common.path;

public class ObjectOISerializableEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("igor", "gruntik", "gruntikFor", "myPass1234", 23);
        User user2 = new User("igor2", "gruntik2", "gruntikFor2", "myPass1234", 23);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path + "objects.dat"));
        oos.writeObject(List.of(user, user2));
        oos.writeUTF("hello igor");
        oos.writeUTF("hello igor");
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path + "objects.dat"));
        List<User> listUser = (List<User>) ois.readObject();
        String greetings = ois.readUTF();
        String greetings2 = ois.readUTF();

        System.out.println(listUser);
        System.out.println(greetings);
        System.out.println(greetings2);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class User implements Serializable {
    String name;
    String surname;
    String username;
    transient String password;
    int age;
}
