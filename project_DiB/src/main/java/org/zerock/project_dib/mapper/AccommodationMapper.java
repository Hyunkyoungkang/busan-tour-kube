package org.zerock.project_dib.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.project_dib.accommodation.domain.AccommodationImgVO;
import org.zerock.project_dib.accommodation.domain.AccommodationVO;

import java.util.List;

@Mapper
public interface AccommodationMapper {

    void insertAccommodation(AccommodationVO accommodationVO);

    List<AccommodationVO> findAll();

    AccommodationVO selectOne(int ano);

    void update(AccommodationVO accommodationVO);

    void delete(int ano);

    void insertFile(AccommodationImgVO accommodationImgVO);

    void updateFile(AccommodationImgVO accommodationImgVO);

    void deleteFile(int ano);

    List<AccommodationImgVO> findAllFilesByAno(int ano);

    List<AccommodationImgVO> findAllFiles();

}
