package uk.gov.dwp.esb.mappers;


import fr.xebia.extras.selma.Mapper;
import uk.gov.dwp.esb.vo.CMECInquireDEODetailsResponseVO;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.CMECInquireDEODetailsResponse;

@Mapper
public interface InquiryScheduleMapper {
	public CMECInquireDEODetailsResponse getCMECInquireDEODetailsResponse(CMECInquireDEODetailsResponseVO cmecInquireDEODetailsResponseVO);
	public CMECInquireDEODetailsResponseVO getCMECInquireDEODetailsResponseVO(CMECInquireDEODetailsResponse cmecInquireDEODetailsResponseVO);
}
