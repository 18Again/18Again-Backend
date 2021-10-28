package com.withmountain.again18.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withmountain.again18.domain.BoardUserDTO;
import com.withmountain.again18.domain.DistanceDTO;
import com.withmountain.again18.domain.UserDTO;
import com.withmountain.again18.mapper.BoardUserMapper;
import com.withmountain.again18.mapper.DistanceMapper;
import com.withmountain.again18.util.DistanceCalculation;
import com.withmountain.again18.util.ListComparator;

@Service
public class BoardUserServiceImple extends DistanceCalculation implements BoardUserService {
	
	@Autowired
	private BoardUserMapper boardUserMapper;
	@Autowired
	private DistanceMapper distanceMapper;

	@Override
	public List<BoardUserDTO> getRecommendBoardList(UserDTO user) {
		
		List<BoardUserDTO> boardUsers = boardUserMapper.selectBoardJoinUser(user.getId().intValue());
//		List<DistanceDTO> distances = distanceMapper.getDistanceListByUserId(user.getId().intValue());
		
		int cnt = 0;
		
		/*
		 * if (distances.size()!=0) { for (DistanceDTO distance:distances) { Long userId
		 * = distance.getUserId1()==user.getId()? distance.getUserId2():
		 * distance.getUserId1();
		 * boardUsers.stream().filter(t->t.getUser().getId()==userId).forEach(s->s.
		 * setDistance(distance.getDistance())); } }
		 */

		while(true) {
			for (BoardUserDTO boardUser:boardUsers) {
				if (boardUser.getDistance()==-1.0) {
					cnt ++;
					HashMap<String, Integer> otherBinaryData = new HashMap<String, Integer>();
					otherBinaryData.put("friendship", boardUser.getUser().getFriendship());
					otherBinaryData.put("climbingMate", boardUser.getUser().getClimbingMate());
					HashMap<String, Integer> userBinaryData = new HashMap<String, Integer>();
					userBinaryData.put("friendship", user.getFriendship());
					userBinaryData.put("climbingMate", user.getClimbingMate());
					
					HashMap<String, Double> otherOrderData = new HashMap<String, Double>();
					otherOrderData.put("exercise", boardUser.getUser().getExercise());
					otherOrderData.put("difficulty", boardUser.getUser().getDifficulty());
					otherOrderData.put("climbingLevel", boardUser.getUser().getClimbingLevel());
					otherOrderData.put("frequency", boardUser.getUser().getFrequency());
					HashMap<String, Double> userOrderData = new HashMap<String, Double>();
					userOrderData.put("exercise", user.getExercise());
					userOrderData.put("difficulty", user.getDifficulty());
					userOrderData.put("climbingLevel", user.getClimbingLevel());
					userOrderData.put("frequency", user.getFrequency());
					
					Double distance = super.calculateBinaryData(userBinaryData, otherBinaryData) + super.calculateOrdinalData(userOrderData, otherOrderData);
					//DistanceDTO distanceDTO = new DistanceDTO(user.getId(), boardUser.getUser().getId(), distance);
					 
					boardUsers.stream().filter(t->t.getUser().getId()==boardUser.getUser().getId()).forEach(s->s.setDistance(distance)); 
//					if (distanceMapper.insertDistance(distanceDTO)>0) {
//						boardUsers.stream().filter(t->t.getUser().getId()==boardUser.getUser().getId()).forEach(s->s.setDistance(distance)); 
//					}
					 
					
				}
		
				if (boardUsers.stream().filter(t->t.getDistance()==-1.0).toList().size()==0) {
					
//					Comparator<CustomData> compare = Comparator .comparing(CustomData::getDateTime) .thenComparing(CustomData::getSequenceNumber); 
//					List<CustomData> sortedList = list.stream() .sorted(compare) .collect(Collectors.toList());

					Comparator<BoardUserDTO> compare = Comparator.comparing(BoardUserDTO::getDistance).thenComparing(BoardUserDTO::getDate);
					return boardUsers.stream().sorted(compare).collect(Collectors.toList());
				}
					
			}
		}
		
	}

	@Override
	public List<BoardUserDTO> getBoardsByUser(String userId) {
		
		return boardUserMapper.selectBoardListByUser(userId);
	}

	@Override
	public List<BoardUserDTO> getBoardList(long id) {
		
		return boardUserMapper.selectBoardList(id);
	}

}
