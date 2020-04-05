package com.knowyou.cloud.sys.tool;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.knowyou.cloud.sys.dao.IndexKeyMapper;
import com.knowyou.cloud.sys.model.mobilebox.IndexKey;

/**
 * 类说明:生产文件ID，采用单列模式，保证文件ID的唯一性
 * 
 * @author 作者 :bill.mei
 * @date 创建时间：2017年3月7日 下午2:40:24
 * @version 1.0
 */
public class FileKey {

	private static volatile FileKey _install;

	private Map<String, Integer> keyList; // 数据缓存,减少查询次数

	public FileKey() {
		keyList = new HashMap<String, Integer>();
	}

	/**
	 * @return 返回文件ID生产对象
	 */
	public static synchronized FileKey getInstall() {
		if (_install == null) {
			synchronized (FileKey.class) {
				if (_install == null) {
					_install = new FileKey();
				}
			}
		}
		return _install;
	}

	/**
	 * 获取原始文件流水号
	 * 
	 * @return 返回文件ID生产对象
	 */
	public synchronized String getFileIndex(IndexKeyMapper mapper) {
		return getIndex("file", mapper);
	}
	
	/**
	 * 根据Key获取流水号
	 * 
	 * @param key
	 *            流水号标示
	 * 
	 * @return 流水号
	 */
	private String getIndex(String key, IndexKeyMapper mapper) {
		int index = 0;
		// IndexKeyDao keyDao = new IndexKeyDao(); // 编码持久化类
		IndexKey keyModel = null;
		if (!keyList.containsKey(key)) { // 没缓存的，从数据库取
			keyModel = mapper.GetInde(key);
			if (keyModel == null) { // 数据没有的，创建一个,保存
				index = 1;
				keyModel = new IndexKey();
				keyModel.setName(key);
				keyModel.setKeyIndex(index);
				keyModel.setCreateTime(new Date());
				mapper.insert(keyModel);
			} else {
				index = keyModel.getKeyIndex() + 1;
				keyModel.setKeyIndex(index);
				mapper.update(keyModel);
			}
		} else { // 有缓存的累加，更新数据库
			index = keyList.get(key) + 1;
			// 更新数据库信息
			keyModel = new IndexKey();
			keyModel.setName(key);
			keyModel.setKeyIndex(index);
			mapper.update(keyModel);
		}
		keyList.put(key, index);
		String code = "00000" + toKYCode(index);
		code = code.substring(code.length() - 5, code.length());
		return code;
	}

	/**
	 * 十进制数转换为knwoyou流水号编码
	 * 
	 * @param num
	 *            十进制数
	 * 
	 * @return ky流水号
	 */
	public String toKYCode(int num) {
		// 递归结束条件
		if (num / 62 == 0) {
			return getCode(num);
		}
		int temp = num / 62;
		return toKYCode(temp) + getCode(num % 62);
	}

	/**
	 * ky流水号编码转换为十进制数
	 * 
	 * @param code
	 *            ky流水号
	 * 
	 * @return 十进制数
	 */
	private int kyCodeToInt(String code) {
		int rt = 0;
		for (int i = 0; i < code.length(); i++) {
			rt += getInt(code.substring(i, i + 1)) * Math.pow(62, code.length() - i - 1);
		}
		return rt;
	}

	/**
	 * 十进制转换为ky编码
	 * 
	 * @param index
	 *            十进制数
	 * 
	 * @return ky编码
	 */
	private String getCode(int index) {
		String code = "";
		switch (index) {
		case 0:
			code = "0";
			break;
		case 1:
			code = "1";
			break;
		case 2:
			code = "2";
			break;
		case 3:
			code = "3";
			break;
		case 4:
			code = "4";
			break;
		case 5:
			code = "5";
			break;
		case 6:
			code = "6";
			break;
		case 7:
			code = "7";
			break;
		case 8:
			code = "7";
			break;
		case 9:
			code = "7";
			break;
		case 10:
			code = "A";
			break;
		case 11:
			code = "B";
			break;
		case 12:
			code = "C";
			break;
		case 13:
			code = "D";
			break;
		case 14:
			code = "E";
			break;
		case 15:
			code = "F";
			break;
		case 16:
			code = "G";
			break;
		case 17:
			code = "H";
			break;
		case 18:
			code = "I";
			break;
		case 19:
			code = "J";
			break;
		case 20:
			code = "K";
			break;
		case 21:
			code = "L";
			break;
		case 22:
			code = "M";
			break;
		case 23:
			code = "N";
			break;
		case 24:
			code = "O";
			break;
		case 25:
			code = "P";
			break;
		case 26:
			code = "Q";
			break;
		case 27:
			code = "R";
			break;
		case 28:
			code = "S";
			break;
		case 29:
			code = "T";
			break;
		case 30:
			code = "U";
			break;
		case 31:
			code = "V";
			break;
		case 32:
			code = "W";
			break;
		case 33:
			code = "X";
			break;
		case 34:
			code = "Y";
			break;
		case 35:
			code = "Z";
			break;
		case 36:
			code = "a";
			break;
		case 37:
			code = "b";
			break;
		case 38:
			code = "c";
			break;
		case 39:
			code = "d";
			break;
		case 40:
			code = "e";
			break;
		case 41:
			code = "f";
			break;
		case 42:
			code = "g";
			break;
		case 43:
			code = "h";
			break;
		case 44:
			code = "i";
			break;
		case 45:
			code = "j";
			break;
		case 46:
			code = "k";
			break;
		case 47:
			code = "l";
			break;
		case 48:
			code = "m";
			break;
		case 49:
			code = "n";
			break;
		case 50:
			code = "o";
			break;
		case 51:
			code = "p";
			break;
		case 52:
			code = "q";
			break;
		case 53:
			code = "r";
			break;
		case 54:
			code = "s";
			break;
		case 55:
			code = "t";
			break;
		case 56:
			code = "u";
			break;
		case 57:
			code = "v";
			break;
		case 58:
			code = "w";
			break;
		case 59:
			code = "x";
			break;
		case 60:
			code = "y";
			break;
		case 61:
			code = "z";
			break;
		}
		return code;
	}

	/**
	 * ky编码转换为十进制数
	 * 
	 * @param index
	 *            ky编码
	 * 
	 * @return 十进制数
	 */
	private int getInt(String code) {
		int index = -1;
		switch (code) {
		case "0":
			index = 0;
			break;
		case "1":
			index = 1;
			break;
		case "2":
			index = 2;
			break;
		case "3":
			index = 3;
			break;
		case "4":
			index = 4;
			break;
		case "5":
			index = 5;
			break;
		case "6":
			index = 6;
			break;
		case "7":
			index = 7;
			break;
		case "8":
			index = 8;
			break;
		case "9":
			index = 9;
			break;
		case "A":
			index = 10;
			break;
		case "B":
			index = 11;
			break;
		case "C":
			index = 12;
			break;
		case "D":
			index = 13;
			break;
		case "E":
			index = 14;
			break;
		case "F":
			index = 15;
			break;
		case "G":
			index = 16;
			break;
		case "H":
			index = 17;
			break;
		case "I":
			index = 18;
			break;
		case "J":
			index = 19;
			break;
		case "K":
			index = 20;
			break;
		case "L":
			index = 21;
			break;
		case "M":
			index = 22;
			break;
		case "N":
			index = 23;
			break;
		case "O":
			index = 24;
			break;
		case "P":
			index = 25;
			break;
		case "Q":
			index = 26;
			break;
		case "R":
			index = 27;
			break;
		case "S":
			index = 28;
			break;
		case "T":
			index = 29;
			break;
		case "U":
			index = 30;
			break;
		case "V":
			index = 31;
			break;
		case "W":
			index = 32;
			break;
		case "X":
			index = 33;
			break;
		case "Y":
			index = 34;
			break;
		case "Z":
			index = 35;
			break;
		case "a":
			index = 36;
			break;
		case "b":
			index = 37;
			break;
		case "c":
			index = 38;
			break;
		case "d":
			index = 39;
			break;
		case "e":
			index = 40;
			break;
		case "f":
			index = 41;
			break;
		case "g":
			index = 42;
			break;
		case "h":
			index = 43;
			break;
		case "i":
			index = 44;
			break;
		case "j":
			index = 45;
			break;
		case "k":
			index = 46;
			break;
		case "l":
			index = 47;
			break;
		case "m":
			index = 48;
			break;
		case "n":
			index = 49;
			break;
		case "o":
			index = 50;
			break;
		case "p":
			index = 51;
			break;
		case "q":
			index = 52;
			break;
		case "r":
			index = 53;
			break;
		case "s":
			index = 54;
			break;
		case "t":
			index = 55;
			break;
		case "u":
			index = 56;
			break;
		case "v":
			index = 57;
			break;
		case "w":
			index = 58;
			break;
		case "x":
			index = 59;
			break;
		case "y":
			index = 60;
			break;
		case "z":
			index = 61;
			break;
		}
		return index;
	}
}
