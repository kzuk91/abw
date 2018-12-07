package opl.com.abw.impl;

import opl.com.abw.dao.TagDAO;
import opl.com.abw.entity.Tag;
import opl.com.abw.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    private final TagDAO tagDAO;

    @Autowired
    public TagServiceImpl(TagDAO tagDAO) {
        this.tagDAO = tagDAO;
    }

    @Override
    public List<Tag> getAllTags() {
        return tagDAO.getAllTags();
    }

    @Override
    public Tag getTagById(int tagId) {
        return tagDAO.getTagById(tagId);
    }

    @Override
    public Tag getTagByValue(String value) {
        return tagDAO.getTagByValue(value);
    }

    @Override
    public synchronized boolean addTag(Tag tag) {
        if (tagDAO.tagExists(tag.getName())) {
            return false;
        } else {
            tagDAO.addTag(tag);
            return true;
        }
    }

    @Override
    public void updateTag(Tag tag) {
        tagDAO.updateTag(tag);
    }

    @Override
    public void deleteTag(int tagId) {
        tagDAO.deleteTag(tagId);
    }
}
