package opl.com.abw.impl;


import opl.com.abw.dao.TagDAO;
import opl.com.abw.entity.Tag;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public class TagDAOImpl implements TagDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Tag> getAllTags() {
        String hql = "FROM Tag as tag ORDER BY tag.tagId";
        List<Tag> tagsList = (List<Tag>) entityManager.createQuery(hql).getResultList();
        if (!tagsList.isEmpty())
            return tagsList;
        return Collections.emptyList();
    }

    @Override
    public Tag getTagById(int tagId) {
        return entityManager.find(Tag.class, tagId);
    }

    @Override
    public Tag getTagByValue(String value) {
        String hql = "FROM Tag as tag WHERE tag.value = :value";
        List<Tag> tags = (List<Tag>) entityManager.createQuery(hql).setParameter("value", value).getResultList();
        if (!tags.isEmpty())
            return tags.get(0);
        return null;
    }

    @Override
    public void addTag(Tag tag) {
        entityManager.persist(tag);
    }

    @Override
    public void updateTag(Tag tag) {
        Tag tg = getTagById(tag.getTagId());
        tg.setDescription(tag.getDescription());
        tg.setName(tag.getName());
        tg.setValue(tag.getValue());
        tg.setModifiedDate(new Date());
        tg.setFacts(tag.getFacts());
        entityManager.flush();
    }

    @Override
    public void deleteTag(int tagId) {
        entityManager.remove(getTagById(tagId));
    }

    @Override
    public boolean tagExists(String name) {
        String hql = "FROM Tag as tag WHERE tag.name = :name";
        int count = entityManager.createQuery(hql).setParameter("name", name).getResultList().size();
        return count > 0;
    }
}
