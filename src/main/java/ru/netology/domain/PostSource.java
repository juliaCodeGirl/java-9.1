package ru.netology.domain;

public class PostSource {
    public String getPostSource() {
        return postSource;
    }
    //Поле возвращается только для Standalone-приложений с ключом доступа, полученным в Implicit Flow.
//информация о способе размещения записи. Описание объекта находится на отдельной странице.

    public void setPostSource(String postSource) {
        this.postSource = postSource;
    }

    private String postSource;
}
