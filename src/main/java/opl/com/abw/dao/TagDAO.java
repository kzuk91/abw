package opl.com.abw.dao;

import opl.com.abw.entity.Tag;

import java.util.List;

public interface TagDAO {
    List<Tag> getAllTags();

    Tag getTagById(int tagId);

    Tag getTagByValue(String value);

    void addTag(Tag tag);

    void updateTag(Tag tag);

    void deleteTag(int tagId);

    boolean tagExists(String name);
}
