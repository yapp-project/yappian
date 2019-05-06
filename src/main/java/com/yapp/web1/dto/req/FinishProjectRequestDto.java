package com.yapp.web1.dto.req;

import com.yapp.web1.domain.VO.Mark;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 프로젝트 완료 페이지 작성 Dto
 * @author JiHye Kim
 */
@NoArgsConstructor
@Setter
@Getter
public class FinishProjectRequestDto {

    @NotBlank(message = "프로젝트 설명을 입력하세요.")
    @Size(min = 30)
    private String description; // 프로젝트 소개

    @NotBlank(message = "프로젝트 URL을 입력하세요.")
    private String productURL; // 프로젝트 URL

    @NotNull(message = "런칭 유무를 체크해 주세요")
    private Mark releaseCheck = Mark.N;

    @Builder
    public FinishProjectRequestDto(String description, String productURL, Mark releaseCheck){
        this.description = description;
        this.productURL = productURL;
        this.releaseCheck = releaseCheck;
    }
}
