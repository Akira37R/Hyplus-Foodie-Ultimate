package top.hyperplasma.service;

import top.hyperplasma.vo.OrderReportVO;
import top.hyperplasma.vo.TurnoverReportVO;
import top.hyperplasma.vo.UserReportVO;

import java.time.LocalDate;

public interface ReportService {

    /**
     * 统计指定时间区间内的营业额
     *
     * @param begin
     * @param end
     * @return TurnoverReportVO
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);

    /**
     * 统计指定时间区间内的用户数据
     *
     * @param begin
     * @param end
     * @return
     */
    UserReportVO getUserStatistics(LocalDate begin, LocalDate end);

    /**
     * 统计指定时间区间内的订单数据
     *
     * @param begin
     * @param end
     * @return OrderReportVO
     */
    OrderReportVO getOrdersStatistics(LocalDate begin, LocalDate end);
}
