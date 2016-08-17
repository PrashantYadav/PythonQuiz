package com.prashant93y.pythonquiz;

import android.provider.BaseColumns;

/**
 * Created by Prashant Yadav on 3/9/2016.
 */
public final class FeedReaderContract {
    public FeedReaderContract(){}

    public static abstract  class FeedEntry  implements BaseColumns{
        public static final String TABLE_NAME = "PythonQuestions";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COL_QUESTION = "QUESTION";
        public static final String COL_OPTION1 = "OPTION1";
        public static final String COL_OPTION2 = "OPTION2";
        public static final String COL_OPTION3 = "OPTION3";
        public static final String COL_OPTION4 = "OPTION4";
        public static final String COL_RIGHT_ANS = "RIGHT_ANS";
        public static final String COL_SOLUTION = "SOLUTION";
        public static final String COL_QUES_LEVEL = "QUES_LEVEL";
        public static final String COL_TAG = "QUESTION_TAG";
        public static final String COL_LIKES = "QUESTION_LIKES";
        public static final String COL_DISLIKES = "QUESTION_DISLIKES";

    }
}
