/**
 * Copyright 2016
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import sg.edu.nus.comp.nlp.ims.implement.CTester;

import java.util.ArrayList;

public class ImsWsdDisambiguatorTests {

    private static final String LEMMA = "0";
    private static final String POS = "0";
    private static final String TOKEN = "0";
    private static final String SPLIT = "0";
    private static final String DELIMITER = "/";

    private static final String LDIR = ".\\..\\lib";

    private static final String TEST_FILE = ".\\input.txt";
    private static final String SAVE_PATH = ".\\output.txt";
    private static final String MODEL_DIR = LDIR + "\\lib\\models-MUN-SC-wn30";

    private static final String SENSE_INDEX = LDIR + "\\dict\\index.sense";


    /**
     * testPlain.sh as JUnitTest
     * place lib and models dirs relative to IMS path
     * default lib/props.xml edited
     * <version publisher="Princeton" number="3" language="en"/>
     * <param name="dictionary_path" value="./../lib/dict"/>
     */
	@Test
    @Ignore
	public void imsTestPlainTest() {

	    String[] args = new String[30];
        args[0] = "-ptm";
        args[1] = LDIR + "\\tag.bin.gz";

        args[2] = "-tagdict";
        args[3] = LDIR + "\\tagdict.txt";

        args[4] = "-ssm";
        args[5] = LDIR + "\\EnglishSD.bin.gz";

        args[6] = "-prop";
        args[7] = LDIR  + "\\prop.xml";

        args[8] = "-f";
        args[9] = "sg.edu.nus.comp.nlp.ims.feature.CAllWordsFeatureExtractorCombination";

        args[10] = "-c";
        args[11] = "sg.edu.nus.comp.nlp.ims.corpus.CAllWordsPlainCorpus";

        args[12] = "-r";
        args[13] = "sg.edu.nus.comp.nlp.ims.io.CPlainCorpusResultWriter";

        args[14] = "-is";
        args[15] = SENSE_INDEX;
        args[16] = TEST_FILE;
        args[17] = MODEL_DIR;
        args[18] = MODEL_DIR;
        args[19] = SAVE_PATH;

        args[20] = "-delimiter";
        args[21] = DELIMITER;

        args[22] = "-split";
        args[23] = SPLIT;

        args[24] = "-token";
        args[25] = TOKEN;

        args[26] = "-pos";
        args[27] = POS;

        args[28] = "-lemma";
        args[29] = LEMMA;

        CTester.main(args);
	}
}