package me.aias.example.utils;

import ai.djl.Device;
import ai.djl.repository.zoo.Criteria;
import ai.djl.training.util.ProgressBar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SentenceEncoderEN {

  private static final Logger logger = LoggerFactory.getLogger(SentenceEncoderEN.class);

  public SentenceEncoderEN() {}

  public Criteria<String, float[]> criteria() {

    Criteria<String, float[]> criteria =
        Criteria.builder()
            .setTypes(String.class, float[].class)
            .optModelUrls(
                "https://aias-home.oss-cn-beijing.aliyuncs.com/models/nlp_models/sentence_transformers/paraphrase-MiniLM-L6-v2.zip")
            //            .optModelUrls("/Users/calvin/msmarco-MiniLM-L-6-v3/")
            .optTranslator(new SentenceTransTranslator())
            .optEngine("PyTorch") // Use PyTorch engine
            .optDevice(Device.cpu())
            .optProgress(new ProgressBar())
            .build();

    return criteria;
  }
}
