package com.hgc.school.dto;

import com.hgc.school.vo.CommentInfo;
import com.hgc.school.vo.Info;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

/**
 * 帖子和评论的数据传输对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoWithCommentsDTO {
    private Info info;//帖子
    private List<CommentInfo> comments;//帖子相关的所有评论

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoWithCommentsDTO that = (InfoWithCommentsDTO) o;
        return Objects.equals(info, that.info) && Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info, comments);
    }
}
