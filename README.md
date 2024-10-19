


<div align="center">
<div align="center">
<img src="https://aias-home.oss-cn-beijing.aliyuncs.com/images/logo.png"  width = "200"  />
</div>

[![star](https://gitee.com/mymagicpower/AIAS/badge/star.svg?theme=gvp)](https://gitee.com/mymagicpower/AIAS/stargazers)   [![fork](https://gitee.com/mymagicpower/AIAS/badge/fork.svg?theme=gvp)](https://gitee.com/mymagicpower/AIAS/members)
<h4 align="center">
    <p>
        <b>中文</b> |
        <a href="https://github.com/mymagicpower/AIAS/blob/main/README_EN.md">English</a>
    <p>
</h4>
<h4 align="center">
    <p>
        <b>官网</b> |
        <a href="http://www.aias.top/">http://www.aias.top/</a>
    <p>
</h4>
</div>

<br>
<hr>
<br>

<div align="center">
<img src="https://aias-home.oss-cn-beijing.aliyuncs.com/images/AIAS.png"  width = "600"  />
</div>


<div align="center">
  <table>
    <tr>
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/images/aias_training1.png"  width = "250"  />
        </div>
      </td>
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/images/aias_search.png"  width = "250"  />
        </div>
      </td>
    </tr>  
    <tr>
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/image_search/images/face_search.png"  width = "250"  />
        </div>
      </td>
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/train_platform/images/training.png"  width = "250"  />
        </div>
      </td>
    </tr>   
  </table>

</div>

#### 项目清单:

- 1. 1_image_sdks - [图像识别 SDK]
```text
  1). 工具箱系列：图像处理工具箱（静态图像）
  2). 目标检测：目标检测、目标跟踪、人脸检测&识别
  3). 图像分割：图像分割、医疗影像
  4). 行为分析：行为识别、姿态估计
  5). GAN：    超分辨率、动作驱动、风格迁移、图像生成
  6). 其它类别：OCR、深度估计、视频理解、图像检索
      ...
```

<div align="center">
  <table>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>OCR工具箱 1：OCR方向检测与旋转 - ocr_sdks/ocr_direction_det_sdk</p>
          OCR图像预处理。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/OCR/images/RotationExample.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>OCR工具箱 2：OCR文字识别 - ocr_sdks/ocr_v3_sdk</p>
            1.  V3 文本检测: <br>
            - 中文文本检测<br>
            - 英文文本检测<br>
            - 多语言文本检测<br> 
            2.  V3 文本识别:<br> 
            - 中文简体<br> 
            - 中文繁体<br> 
            - 英文<br> 
            - 韩语<br> 
            - 日语<br> 
            - 阿拉伯<br> 
            - 梵文<br> 
            - 泰米尔语<br> 
            - 泰卢固语<br> 
            - 卡纳达文<br> 
            - 斯拉夫<br> 
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/OCR/images/OcrV3RecExample2.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>OCR工具箱 3：OCR文字识别 - ocr_sdks/ocr_v4_sdk</p>
          原生支持旋转倾斜文本文字识别。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/OCR/images/OcrV3RecExample2.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>OCR工具箱 4：版面分析 - ocr_sdks/ocr_layout_sdk</p>
               可以用于配合文字识别，表格识别的流水线处理使用。   <br>
               1.  中文版面分析<br>
               2.  英文版面分析<br>
               3.  中英文文档 - 表格区域检测<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/OCR/images/LayoutCNDetExample.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>    
    <tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>OCR工具箱 5： 表格识别 - ocr_sdks/ocr_table_sdk</p>
               中英文表格识别。  
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/OCR/images/TableENRecExample.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>    
    <tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>OCR工具箱 6： led文字识别 - ocr_sdks/ocr_led_sdk</p>
               led表盘文字识别。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/OCR/images/led_rec_result.png"  width = "400px"/>
        </div>
      </td>
    </tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>人脸工具箱 1：人脸检测(含5个人脸关键点) - face_sdks/face_detection_sdk</p>
          人脸检测(含5个人脸关键点)提供了两个模型的实现。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/face_sdk/images/retinaface_detected.png"  width = "400px"/>
        </div>
      </td>
    </tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>人脸工具箱 2：人脸对齐- face_sdks/face_alignment_sdk</p>
          根据人脸关键点对齐人脸。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/face_sdk/images/face_align.png"  width = "400px"/>
        </div>
      </td>
    </tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>人脸工具箱 3：人脸特征提取与比对- face_sdks/face_feature_sdk</p>
          人脸识别完整的pipeline：人脸检测(含人脸关键点) --> 人脸对齐 --> 人脸特征提取 --> 人脸比对
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/face_sdk/images/face_feature.png"  width = "400px"/>
        </div>
      </td>
    </tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>人脸工具箱 4：人脸分辨率提升- face_sdks/face_sr_sdk</p>
          包含两个功能：<br>
          1.单张人脸图片超分辨。<br>
          2.自动检测人脸，然后对齐人脸后提升分辨率。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/face_sdk/images/single_face_sr.png"  width = "400px"/>
        </div>
      </td>
    </tr>
      <tr>
      <td style="width:220px">
        <div align="left">
          <p>人脸工具箱 5：图片人脸修复- face_sdks/face_restoration_sdk</p>
            - 自动检测人脸及关键地，然后抠图，然后根据人脸关键点转正对齐。<br>
            - 对所有转正对齐的人脸提升分辨率。<br>
            - 使用分割模型提取人脸，逆向变换后贴回原图。   
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/face_sdk/images/face_res.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>人脸工具箱 6：口罩检测 - face_sdks/mask_sdk</p>
          口罩检测，给出检测框。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/mask_sdk/face-masks.png"  width = "400px"/>
        </div>
      </td>
    </tr>              
    <tr>
      <td>
        <div align="left">
          <p>动物分类识别 - classification/animal_sdk</p>   
           动物识别sdk，支持7978种动物的分类识别。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/animal_sdk/tiger.jpeg" width = "400px"/>
        </div>
      </td>
    </tr> 
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>菜品分类识别 - classification/dish_sdk</p> 
          菜品识别sdk，支持8416种菜品的分类识别。   
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/dish_sdk/dish.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr> 
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>烟火检测 - fire_smoke_sdk</p>
          烟火检测，给出检测框和置信度。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/sec_sdks/images/fire_detect_result.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>行人检测 - pedestrian_sdk</p>
          行人检测，给出检测框和置信度。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/sec_sdks/images/ped_result.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>反光衣检测 - reflective_vest_sdk</p>
          实现施工区域或者危险区域人员穿戴检测。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/sec_sdks/images/reflective_detect_result.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>智慧工地检测 - smart_construction_sdk</p>
          支持检测的类别：人体，安全帽。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/sec_sdks/images/helmet_head_person_l.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>车辆检测 - vehicle_sdk</p>
          车辆检测，给出检测框和置信度。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/sec_sdks/images/vehicle_result.png"  width = "400px"/>
        </div>
      </td>
    </tr>                                                       
  </table>
</div>

- 2. 2_nlp_sdks - [自然语言 SDK]
```text
  1). 工具箱系列：sentencepiece，fastText，npy/npz文件处理等。
  2). 大模型
  3). 词向量
  4). 机器翻译
      ...
```

<div align="center">
  <table>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>fastText - kits/fasttext_sdk</p>
          fastText是一个快速文本分类算法。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/fastText.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>解析npy/npz文件 - kits/npy_npz_sdk</p>
          java读取python numpy保存的npz、npy文件。。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/numpy.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>Sentencepiece分词 - kits/sentencepiece_sdk</p>
          Sentencepiece分词的Java实现。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/wordpiece.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>jieba分词 - lexical_analysis/jieba_sdk</p>
          jieba分词java版本的简化实现。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/jieba.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>词法分析SDK [中文] - lexical_analysis/lac_sdk</p>
          词法分析模型能整体性地完成中文分词、词性标注、专名识别任务。    
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/lac_network.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>202种语言互相翻译 - translation/trans_nllb_sdk</p>
          支持202种语言互相翻译,支持 CPU / GPU。    
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/translation.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>中英互相翻译 - translation/translation_sdk</p>
          可以进行英语和中文之间的翻译,支持 CPU / GPU。    
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/translation.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>
      <td style="width:220px">
        <div align="left">
          <p>代码特征向量提取工具箱 - embedding/*</p>
            3个SDK：<br>
            1.code2vec_sdk<br>
            2.codet5p_110m_sdk<br>
            3.mpnet_base_v2_sdk<br>
            自然语言与代码特征提取工具箱提供3个SDK，以满足不同精度与速度的需要。。   
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/Universal-Sentence-Encoder.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    </tr>
      <td style="width:220px">
        <div align="left">
          <p>文本特征提取向量工具箱【中文】 - embedding/*</p>
            文本语义特征提取工具箱提供4个 SDK：<br>
            1.m3e_cn_sdk<br>
            2.text2vec_base_chinese_sdk<br>
            3.text2vec_base_chinese_sentence_sdk<br>
            4.text2vec_base_chinese_paraphrase_sdk
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/Universal-Sentence-Encoder.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    </tr>
      <td style="width:220px">
        <div align="left">
          <p>文本特征提取向量工具箱【中文】 - embedding/*</p>
            文本语义特征向量提取工具箱【多语言】提供 3 个 SDK：<br>
            1.sentence_encoder_15_sdk（支持 15 种语言）<br>
            2.sentence_encoder_100_sdk（支持100种语言）<br>
            3.text2vec_base_multilingual_sdk（支持50+种语言）
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/Universal-Sentence-Encoder.png"  width = "400px"/>
        </div>
      </td>
    </tr>                                                           
  </table>
</div>


- 3. 3_audio_sdks - [语音处理 SDK]
```text
  1). 工具箱系列：音素工具箱，librosa，java sound，javacv ffmpeg, fft, vad工具箱等。
  2). 声音克隆
  3). 语音合成
  4). 声纹识别
  5). 语音识别
      ...
```

<div align="center">
  <table>
    <tr>
      <td>
        <div align="left">
          <p>语音识别（ASR）【短语音】 - asr_whisper_sdk</p>   
           中文语音识别。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/voice_sdks/asr.jpeg" width = "400px"/>
        </div>
      </td>
    </tr> 
    <tr>
      <td>
        <div align="left">
          <p>语音识别（ASR）【长语音】 - asr_whisper_long_sdk</p>   
           中文语音识别。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/voice_sdks/asr.jpeg" width = "400px"/>
        </div>
      </td>
    </tr> 
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>语音处理包Librosa- librosa_sdk</p> 
          python语音处理库librosa的java实现。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/voice_sdks/phoneme.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr> 
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>TTS 文本转为语音 - tts_sdk</p>
          TTS 文本转为语音。     
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/voice_sdks/SV2TTS.png"  width = "400px"/>
        </div>
      </td>
    </tr>                                                
  </table>
</div>



- 4. 4_video_sdks - [视频解析SDK]
```text
  1). 摄像头口罩检测 - camera_facemask_sdk
  2). MP4检测口罩 - mp4_facemask_sdk
  3). rtsp取流检测口罩 - rtsp_facemask_sdk
```

<div align="center">
  <table>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>摄像头口罩检测 - camera_facemask_sdk</p> 
          读取本地摄像头，实时（需要有显卡的台式机，否则会比较卡顿）检测口罩。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/mask_sdk/face-masks.png"  width = "400px"/>
        </div>
      </td>
    </tr> 
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>MP4检测口罩 - mp4_facemask_sdk</p>
           读取本地MP4文件，实时（需要有显卡的台式机，否则会比较卡顿）检测口罩。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/mask_sdk/face-masks.png"  width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>rtsp取流检测口罩 - rtsp_facemask_sdk</p>
          通过rtsp取流，实时（需要有显卡的台式机，否则会比较卡顿）检测口罩。 
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/mask_sdk/face-masks.png"  width = "400px"/>
        </div>
      </td>
    </tr>                                                 
  </table>
</div>


- 5. 5_bigdata_sdks - [大数据SDK]
```text
  1). flink-情感倾向分析【英文】- flink_sentence_encoder_sdk
  2). kafka-情感倾向分析【英文】- kafka_sentiment_analysis_sdk
      ...
```

<div align="center">
  <table>
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>flink-情感倾向分析【英文】SDK - flink_sentiment_analysis_sdk</p> 
          情感倾向分析（Sentiment Classification）
          针对带有主观描述的文本，可自动判断该文本的情感极性类别并给出相应的置信度。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/sentiment_analysis.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr> 
    <tr>
      <td style="width:220px">
        <div align="left">
          <p>kafka-情感倾向分析【英文】SDK - kafka_sentiment_analysis_sdk</p>
          情感倾向分析（Sentiment Classification）
          针对带有主观描述的文本，可自动判断该文本的情感极性类别并给出相应的置信度。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/nlp_sdks/sentiment_analysis.jpeg"  width = "400px"/>
        </div>
      </td>
    </tr>                                                
  </table>
</div>

- 6. 6_web_app - [Web应用]
```text
  1). 训练引擎
      ...
```

<div align="center">
  <table>
    <tr>
      <td>
        <div align="left">
          <p>AI 训练平台 - training</p>   
          AI训练平台提供分类模型训练能力。并以REST API形式为上层应用提供接口。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/train_platform/images/training.png" width = "400px"/>
        </div>
      </td>
    </tr>                                               
  </table>
</div>

- 7. 7_aigc - [图像生成]
```text
  1). 图像生成预处理工具箱 controlnet_sdks
  2). 图像生成SD工具箱 stable_diffusion_sdks
      ...
```

- 7.1  图像生成预处理工具箱 controlnet_sdks
<div align="center">
  <table>
    <tr>
      <td>
        <div align="left">
          <p>1. Canny 边缘检测</p>   
          - canny_sdk<br>
          - Canny 边缘检测预处理器可很好识别出图像内各对象的边缘轮廓，常用于生成线稿。<br>
          - 对应ControlNet模型： control_canny<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/canny.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>2. MLSD 线条检测</p>   
            - mlsd_sdk<br>
            - MLSD 线条检测用于生成房间、直线条的建筑场景效果比较好。<br>
            - 对应ControlNet模型： control_mlsd<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/mlsd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>3. Scribble 涂鸦</p>   
          - scribble_hed_sdk<br>
          - scribble_pidinet_sdk<br>
          - 不用自己画，图片自动生成类似涂鸦效果的草图线条。<br>
          - 对应ControlNet模型： control_mlsd<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/scribble.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. SoftEdge 边缘检测</p>   
          - softedge_hed_sdk<br>
          - HED - HedScribbleExample<br>
          - HED Safe - HedScribbleExample<br>
          - softedge_pidinet_sdk<br>
          - PidiNet - PidiNetGPUExample<br>
          - PidiNet Safe - PidiNetGPUExample<br>
          - SoftEdge 边缘检测可保留更多柔和的边缘细节，类似手绘效果。<br>
          - 对应ControlNet模型： control_softedge。<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/softedge.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>5. OpenPose 姿态检测</p>   
          - pose_sdk<br>
        - OpenPose 姿态检测可生成图像中角色动作姿态的骨架图(含脸部特征以及手部骨架检测)，这个骨架图可用于控制生成角色的姿态动作。<br>
        - 对应ControlNet模型： control_openpose。<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/openpose.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>6. Segmentation 语义分割</p>   
          - seg_upernet_sdk<br>
        - 语义分割可多通道应用，原理是用颜色把不同类型的对象分割开，让AI能正确识别对象类型和需求生成的区界。<br>
        - 对应ControlNet模型： control_seg。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/seg.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>7. Depth 深度检测</p>   
          - depth_estimation_midas_sdk<br>
          - Midas - MidasDepthEstimationExample<br>
          - depth_estimation_dpt_sdks<br>
          - DPT - DptDepthEstimationExample<br>
          - 通过提取原始图片中的深度信息，生成具有原图同样深度结构的深度图，越白的越靠前，越黑的越靠后。<br>
          - 对应ControlNet模型： control_depth。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/depth.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>8. Normal Map 法线贴图</p>   
          - normal_bae_sdk<br>
          - NormalBaeExample<br>
          - 根据图片生成法线贴图，适合CG或游戏美术师。法线贴图能根据原始素材生成一张记录凹凸信息的法线贴图，便于AI给图片内容进行更好的光影处理，它比深度模型对于细节的保留更加的精确。法线贴图在游戏制作领域用的较多，常用于贴在低模上模拟高模的复杂光影效果。<br>
          - 对应ControlNet模型： control_normal。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/normal.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>9. Lineart 生成线稿</p>   
          - lineart_sdk<br>
          - lineart_coarse_sdk<br>
          - Lineart 边缘检测预处理器可很好识别出图像内各对象的边缘轮廓，用于生成线稿。
          - 对应ControlNet模型： control_lineart。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/lineart.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>10. Lineart Anime 生成线稿</p>   
          - lineart_anime_sdk<br>
          - LineArtAnimeExample<br>
          - Lineart Anime 边缘检测预处理器可很好识别出卡通图像内各对象的边缘轮廓，用于生成线稿。<br>
          - 对应ControlNet模型： control_lineart_anime。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/lineart_anime.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>11. Content Shuffle</p>   
          - content_shuffle_sdk<br>
          - ContentShuffleExample<br>
          - Content Shuffle 图片内容变换位置，打乱次序，配合模型 control_v11e_sd15_shuffle 使用。<br>
          - 对应ControlNet模型： control_shuffle。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/shuffle.png" width = "400px"/>
        </div>
      </td>
    </tr>                                                  
  </table>
</div>

- 7.2  图像生成SD工具箱 stable_diffusion_sdks
<div align="center">
  <table>
    <tr>
      <td>
        <div align="left">
          <p>1. 文生图：输入提示词（仅支持英文），生成图片（仅支持英文）</p>
            - txt2image_sdk<br> 
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/stable_diffusion/astronaut.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>2. 图生图：根据图片及提示词（仅支持英文）生成图片</p>
            - image2image_sdk<br> 
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/stable_diffusion/astronaut.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>3. Lora 文生图</p>
            - lora_sdk<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/stable_diffusion/astronaut.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.1. Canny 边缘检测</p>
            - controlnet_canny_sdk<br>  
            - Canny 边缘检测预处理器可很好识别出图像内各对象的边缘轮廓，常用于生成线稿。<br>  
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/canny_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.2. MLSD 线条检测</p>
            - controlnet_mlsd_sdk<br>
            - MLSD 线条检测用于生成房间、直线条的建筑场景效果比较好。<br> 
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/mlsd_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.3. Scribble 涂鸦</p>
            - controlnet_scribble_sdk<br>    
            - 不用自己画，图片自动生成类似涂鸦效果的草图线条。<br> 
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/scribble_sd.pngs" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.4. SoftEdge 边缘检测</p>
            - controlnet_softedge_sdk<br>   
            - SoftEdge 边缘检测可保留更多柔和的边缘细节，类似手绘效果。<br> 
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/softedge_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.5. OpenPose 姿态检测</p>
            - controlnet_pose_sdk<br>   
            - OpenPose 姿态检测可生成图像中角色动作姿态的骨架图(含脸部特征以及手部骨架检测)，这个骨架图可用于控制生成角色的姿态动作。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/openpose_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.6. Segmentation 语义分割</p>
            - controlnet_seg_sdk<br>   
            - 语义分割可多通道应用，原理是用颜色把不同类型的对象分割开，让AI能正确识别对象类型和需求生成的区界。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/seg_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.7. Depth 深度检测</p>
            - controlnet_depth_sdk<br>   
            - 通过提取原始图片中的深度信息，生成具有原图同样深度结构的深度图，越白的越靠前，越黑的越靠后。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/depth_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.8. Normal Map 法线贴图</p>
            - controlnet_normal_sdk<br>   
            - 根据图片生成法线贴图，适合CG或游戏美术师。法线贴图能根据原始素材生成一张记录凹凸信息的法线贴图，便于AI给图片内容进行更好的光影处理，它比深度模型对于细节的保留更加的精确。法线贴图在游戏制作领域用的较多，常用于贴在低模上模拟高模的复杂光影效果。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/normal_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.9. Lineart 生成线稿</p>
            - controlnet_lineart_sdk<br>   
            - controlnet_lineart_coarse_sdk<br>   
            - Lineart 边缘检测预处理器可很好识别出图像内各对象的边缘轮廓，用于生成线稿。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/lineart_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.10. Lineart Anime 生成线稿</p>
            - controlnet_lineart_anime_sdk<br>   
            - 通过提取原始图片中的深度信息，生成具有原图同样深度结构的深度图，越白的越靠前，越黑的越靠后。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="Lineart Anime 边缘检测预处理器可很好识别出卡通图像内各对象的边缘轮廓，用于生成线稿。" width = "400px"/>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <div align="left">
          <p>4. Controlnet 图像生成-4.11. Content Shuffle</p>
            - controlnet_shuffle_sdk<br>   
            - Content Shuffle 图片内容变换位置，打乱次序，配合模型 control_v11e_sd15_shuffle 使用。
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/AIAS/9_aigc/images/shuffle_sd.png" width = "400px"/>
        </div>
      </td>
    </tr>                                              
  </table>
</div>

- 8 8_desktop_app - [桌面App]
```text
  1). 大模型离线桌面App
  2). OCR文字识别桌面App
  3). 图像高清放大桌面App
      ...
```
<div align="center">
  <table>
    <tr>
      <td>
        <div align="left">
          <p>大模型离线桌面App - desktop_app_llm</p>   
            - 支持中/英文
            - 模型支持chatglm3，llama3，alpaca3等<br>
            - 支持4位，8位量化，16位半精度模型。<br>
            - 支持windows及mac系统<br>
            - 支持CPU，GPU<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aias-home.oss-cn-beijing.aliyuncs.com/products/apps/desktop_llm1.png" width = "400px"/>
        </div>
      </td>
    </tr>         
    <tr>
      <td>
        <div align="left">
          <p>OCR文字识别桌面App - desktop_app_ocr</p>   
          - 图片文字识别<br>
          - 支持windows, linux, mac 一键安装
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aiart.oss-cn-shanghai.aliyuncs.com/assets/ocr.jpeg" width = "400px"/>
        </div>
      </td>
    </tr>         
    <tr>
      <td>
        <div align="left">
          <p>图像高清放大桌面App - desktop_app_upscale</p>   
            - 单张图片分辨率放大<br>
            - 批量图片分辨率放大<br>
            - 支持 windows, macos, ubuntu<br>
        </div>
      </td>     
      <td>
        <div align="center">
        <img src="https://aiart.oss-cn-shanghai.aliyuncs.com/assets/upscale.png" width = "400px"/>
        </div>
      </td>
    </tr>                                         
  </table>
</div>

#### 1. 官网: 
- 网址：http://www.aias.top/
- 帮助：https://aias.top/guides.html

#### 2. 开源地址: 

- Gitee:  https://gitee.com/mymagicpower/AIAS
- GitHub: https://github.com/mymagicpower/AIAS

#### 3. 人工智能算法：
- https://zhuanlan.zhihu.com/p/693738275


#### 4. 其它研究专题:

#### 1). AI + 量子计算
<div align="left">
<img src="https://qubits.oss-cn-shanghai.aliyuncs.com/images/logo.png"  width = "150"  />
</div>

- 官网: http://www.qubits.top/
- Gitee:  https://gitee.com/mymagicpower/qubits
- GitHub: https://github.com/mymagicpower/qubits

#### 2). AI + 生物医药
<div align="left">
<img src="https://bio-computing.oss-cn-shanghai.aliyuncs.com/images/logo.png"  width = "200"  />
</div>

- 官网: http://www.biocomputing.top/
- Gitee:  https://gitee.com/mymagicpower/bio-computing
- GitHub: https://github.com/mymagicpower/bio-computing


