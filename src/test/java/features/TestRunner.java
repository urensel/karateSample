package features;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestRunner {

//    @Karate.Test
//    Karate testReqres() {
//        return Karate.run("reqres").relativeTo(getClass());
//    }
//
//    @Karate.Test
//    Karate testGitHub() {
//        return Karate.run("github").relativeTo(getClass());
//    }
//
    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:features").relativeTo(getClass());

    }


//    @Test
//    void testParallel() {
//        Results results = Runner.path("classpath:features").parallel(5);
//        assertEquals(0, results.getFailCount(), results.getErrorMessages());
//    }

//    @Test
//    void testParallel() {
//        Results results = Runner.path("classpath:features").parallel(5);
//        assertEquals(0, results.getFailCount(), results.getErrorMessages());
//        generateReport(results.getReportDir());
//    }

//    public static void generateReport(String karateOutputPath) {
//        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[] {"json"}, true);
//        List<String> jsonPaths = new ArrayList(jsonFiles.size());
//        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
//        Configuration config = new Configuration(new File("target"), "demo");
//        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
//        reportBuilder.generateReports();
//    }

}
