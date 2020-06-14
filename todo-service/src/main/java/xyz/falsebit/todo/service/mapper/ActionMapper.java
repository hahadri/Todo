package xyz.falsebit.todo.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import xyz.falsebit.todo.data.domain.Action;
import xyz.falsebit.todo.service.dto.ActionDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ActionMapper {

    ActionDto toActionDto(Action action);

    Action toActionEntity(ActionDto actionDto);

    List<ActionDto> toListOfActionDto(List<Action> actionEntityList);

    List<Action> toListOfActionEntity(List<ActionDto> actionDtoList);

}
