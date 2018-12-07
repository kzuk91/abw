package opl.com.abw.service;

import opl.com.abw.entity.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getAllTags();

    Tag getTagById(int tagId);

    Tag getTagByValue(String value);

    boolean addTag(Tag tag);

    void updateTag(Tag tag);

    void deleteTag(int tagId);
}
