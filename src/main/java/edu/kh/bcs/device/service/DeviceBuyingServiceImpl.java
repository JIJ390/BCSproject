package edu.kh.bcs.device.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.bcs.device.dto.Device;
import edu.kh.bcs.device.mapper.DeviceBuyingMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Transactional
@Service
@RequiredArgsConstructor
@Slf4j
public class DeviceBuyingServiceImpl implements DeviceBuyingService {

	private final DeviceBuyingMapper mapper;
	
	
	@Override
		public Device selectDetailDevice(int deviceNo) {
			return mapper.selectDetailDevice(deviceNo);
		}
}
