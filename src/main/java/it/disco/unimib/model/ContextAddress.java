package it.disco.unimib.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;
/**
 * ContextAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-23T10:25:57.123Z[GMT]")
public class ContextAddress {
	/**
	 * Gets or Sets _atId
	 */
	public enum AtIdEnum {
		ADDRESS("schema:address");

		private String value;

		AtIdEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AtIdEnum fromValue(String text) {
			for (AtIdEnum b : AtIdEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("@id")
	private AtIdEnum _atId = null;

	/**
	 * Gets or Sets _atType
	 */
	public enum AtTypeEnum {
		ID("@id");

		private String value;

		AtTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static AtTypeEnum fromValue(String text) {
			for (AtTypeEnum b : AtTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("@type")
	private AtTypeEnum _atType = null;

	public ContextAddress _atId(AtIdEnum _atId) {
		this._atId = _atId;
		return this;
	}

	/**
	 * Get _atId
	 * 
	 * @return _atId
	 **/
	@ApiModelProperty(value = "")

	public AtIdEnum getAtId() {
		return _atId;
	}

	public void setAtId(AtIdEnum _atId) {
		this._atId = _atId;
	}

	public ContextAddress _atType(AtTypeEnum _atType) {
		this._atType = _atType;
		return this;
	}

	/**
	 * Get _atType
	 * 
	 * @return _atType
	 **/
	@ApiModelProperty(value = "")

	public AtTypeEnum getAtType() {
		return _atType;
	}

	public void setAtType(AtTypeEnum _atType) {
		this._atType = _atType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ContextAddress contextAddress = (ContextAddress) o;
		return Objects.equals(this._atId, contextAddress._atId) && Objects.equals(this._atType, contextAddress._atType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(_atId, _atType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ContextAddress {\n");

		sb.append("    _atId: ").append(toIndentedString(_atId)).append("\n");
		sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
