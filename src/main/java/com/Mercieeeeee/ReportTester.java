package com.Mercieeeeee;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report financeReport = new FinanceReport();
        Report health = new HealthReport();
        List<Report> reports = new ArrayList<>();
        reports.add(financeReport);
        reports.add(health);
        for (Report report : reports) {
            report.load();
            report.print();
        }
    }
}
